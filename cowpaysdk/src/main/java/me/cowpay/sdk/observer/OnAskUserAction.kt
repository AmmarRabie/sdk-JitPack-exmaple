package me.cowpay.sdk.observer

interface OnAskUserAction {
    abstract fun onPositiveAction()
    abstract fun onNegativeAction()
}