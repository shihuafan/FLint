package com.example.rule

import com.android.tools.lint.detector.api.*
import org.jetbrains.uast.UClass


public class ActivityExtendsBaseCheck :Detector(), Detector.UastScanner {
    companion object {
        val ISSUE= Issue.create(
            "BitmapFactoryReplace",
            "BitmapFactoryReplace",
            "使用Glide或其他第三方框架代替BitmapFactory创建Bitmap",
            Category.CORRECTNESS,
            7,
            Severity.WARNING,
            Implementation(ActivityExtendsBaseCheck::class.java,Scope.JAVA_FILE_SCOPE)
        )
    }

    override fun applicableSuperClasses():List<String>{
        val list= mutableListOf<String>();
        list.add("BaseActivity")
        return list
    }

    override fun visitClass(context: JavaContext, declaration: UClass) {
        context.report(ISSUE,context.getNameLocation(declaration),"使用Glide或其他第三方框架代替BitmapFactory创建Bitmap")
    }

}
