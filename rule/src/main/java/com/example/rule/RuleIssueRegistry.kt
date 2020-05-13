package com.example.rule

import com.android.tools.lint.client.api.IssueRegistry
import com.android.tools.lint.detector.api.Issue
import java.util.*

class RuleIssueRegistry: IssueRegistry() {
    override val issues: List<Issue>
        get() = listOf(ActivityExtendsBaseCheck.ISSUE)
}