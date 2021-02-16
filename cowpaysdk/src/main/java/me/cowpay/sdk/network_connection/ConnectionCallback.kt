package me.cowpay.sdk.network_connection

interface ConnectionCallback {
     fun onStartConnection()

     fun onFailureConnection(errorMessage: String?)

     fun onSuccessConnection(response: String?)
}