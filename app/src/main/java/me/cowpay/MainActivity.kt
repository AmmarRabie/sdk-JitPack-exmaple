package me.cowpay

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import me.cowpay.sdk.PaymentMethodsActivity
import me.cowpay.sdk.util.CowpayConstantKeys
import java.security.SecureRandom

class MainActivity() : AppCompatActivity() {
    private lateinit var authorizationToken: String
    private lateinit var paymentEnvironment: String
    private lateinit var merchantCode: String
    private lateinit var merchantHashKey: String
    private lateinit var amount: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent()
        intent.putExtra(CowpayConstantKeys.Language, CowpayConstantKeys.ENGLISH)

        authorizationToken = "ey";
        paymentEnvironment = "5";
        merchantCode = "5";
        merchantHashKey = "5";
        amount = "5";

        openPaymentList()
    }


    fun payWithCreditCard() {
        var intent = Intent(this@MainActivity, PaymentMethodsActivity::class.java)
        //choose payment method
        var PaymentMethod = ArrayList<String>()
        PaymentMethod.add(CowpayConstantKeys.CreditCardMethod)
        intent.putExtra(CowpayConstantKeys.PaymentMethod, PaymentMethod)
        intent.putExtra(CowpayConstantKeys.AuthorizationToken, authorizationToken)
        //set environment production or sandBox
        //CowpayConstantKeys.Production or CowpayConstantKeys.SandBox
        intent.putExtra(CowpayConstantKeys.PaymentEnvironment, paymentEnvironment)
        //set locale language
        var locale = CowpayConstantKeys.ENGLISH
        intent.putExtra(CowpayConstantKeys.Language, locale)
        CowpayConstantKeys.LanguageCode = locale
        // use pay with credit card
        intent.putExtra(
            CowpayConstantKeys.CreditCardMethodType,
            CowpayConstantKeys.CreditCardMethodPay
        )
        //merchant data
        intent.putExtra(CowpayConstantKeys.MerchantCode, merchantCode)
        intent.putExtra(
            CowpayConstantKeys.MerchantHashKey,
            merchantHashKey
        )
        //order id
        intent.putExtra(CowpayConstantKeys.MerchantReferenceId, getRandomNumber().toString())
        //order price780
        intent.putExtra(CowpayConstantKeys.Amount, amount)
        //user data
        intent.putExtra(CowpayConstantKeys.CustomerName, "John Smith")
        intent.putExtra(CowpayConstantKeys.CustomerMobile, "01234567890")
        intent.putExtra(CowpayConstantKeys.CustomerEmail, "customer@customer.com")
        intent.putExtra(CowpayConstantKeys.Description, "example description")
        //user id
        intent.putExtra(CowpayConstantKeys.CustomerMerchantProfileId, "15")
        startActivityForResult(intent, CowpayConstantKeys.PaymentMethodsActivityRequestCode)
    }

    fun getRandomNumber(): Int {
        val r = SecureRandom()
        val Low = 10000
        val High = 1000000000
        return (System.currentTimeMillis() % Integer.MAX_VALUE).toInt() + (r.nextInt(High - Low) + Low)
    }

    fun payWithFawry() {
        var intent = Intent(this@MainActivity, PaymentMethodsActivity::class.java)
        //choose payment method
        var PaymentMethod = ArrayList<String>()
        PaymentMethod.add(CowpayConstantKeys.FawryMethod)

        intent.putExtra(CowpayConstantKeys.PaymentMethod, PaymentMethod)
        intent.putExtra(CowpayConstantKeys.AuthorizationToken, authorizationToken)
        //set environment production or sandBox
        //CowpayConstantKeys.Production or CowpayConstantKeys.SandBox
        intent.putExtra(CowpayConstantKeys.PaymentEnvironment, paymentEnvironment)
        //set locale language
        var locale = CowpayConstantKeys.ENGLISH
        intent.putExtra(CowpayConstantKeys.Language, locale)
        CowpayConstantKeys.LanguageCode = locale
        //merchant data
        intent.putExtra(CowpayConstantKeys.MerchantCode, merchantCode)
        intent.putExtra(
            CowpayConstantKeys.MerchantHashKey,
            merchantHashKey
        )
        //order id
        intent.putExtra(CowpayConstantKeys.MerchantReferenceId, getRandomNumber().toString())
        //order price780
        intent.putExtra(CowpayConstantKeys.Amount, amount)
        //user data
        intent.putExtra(CowpayConstantKeys.CustomerName, "John Smith")
        intent.putExtra(CowpayConstantKeys.CustomerMobile, "+201096545211")
        intent.putExtra(CowpayConstantKeys.CustomerEmail, "customer@customer.com")
        intent.putExtra(CowpayConstantKeys.Description, "example description")
        //user id
        intent.putExtra(CowpayConstantKeys.CustomerMerchantProfileId, "15")
        startActivityForResult(intent, CowpayConstantKeys.PaymentMethodsActivityRequestCode)
    }

    fun saveCreditCard() {
        var intent = Intent(this@MainActivity, PaymentMethodsActivity::class.java)
        //choose payment method
        var PaymentMethod = ArrayList<String>()
        PaymentMethod.add(CowpayConstantKeys.CreditCardMethod)
        intent.putExtra(CowpayConstantKeys.PaymentMethod, PaymentMethod)
        intent.putExtra(CowpayConstantKeys.AuthorizationToken, authorizationToken)
        //set environment production or sandBox
        //CowpayConstantKeys.Production or CowpayConstantKeys.SandBox
        intent.putExtra(CowpayConstantKeys.PaymentEnvironment, paymentEnvironment)
        //set locale language
        var locale = CowpayConstantKeys.ENGLISH
        intent.putExtra(CowpayConstantKeys.Language, locale)
        CowpayConstantKeys.LanguageCode = locale
        // use save credit card
        intent.putExtra(
            CowpayConstantKeys.CreditCardMethodType,
            CowpayConstantKeys.CreditCardMethodSave
        )
        //merchant data
        intent.putExtra(CowpayConstantKeys.MerchantCode, merchantCode)
        intent.putExtra(
            CowpayConstantKeys.MerchantHashKey,
            merchantHashKey
        )
        //order id
        intent.putExtra(CowpayConstantKeys.MerchantReferenceId, getRandomNumber().toString())
        //order price780
        intent.putExtra(CowpayConstantKeys.Amount, amount)
        //user data
        intent.putExtra(CowpayConstantKeys.CustomerName, "John Smith")
        intent.putExtra(CowpayConstantKeys.CustomerMobile, "01234567890")
        intent.putExtra(CowpayConstantKeys.CustomerEmail, "customer@customer.com")
        intent.putExtra(CowpayConstantKeys.Description, "example description")
        //user id
        intent.putExtra(CowpayConstantKeys.CustomerMerchantProfileId, "15")
        startActivityForResult(intent, CowpayConstantKeys.PaymentMethodsActivityRequestCode)
    }

    fun openPaymentList() {
        var intent = Intent(this@MainActivity, PaymentMethodsActivity::class.java)
        //choose payment method
        var PaymentMethod = ArrayList<String>()
        PaymentMethod.add(CowpayConstantKeys.CreditCardMethod)
        PaymentMethod.add(CowpayConstantKeys.FawryMethod)
        intent.putExtra(CowpayConstantKeys.PaymentMethod, PaymentMethod)
        intent.putExtra(CowpayConstantKeys.AuthorizationToken, authorizationToken)
        //set environment production or sandBox
        //CowpayConstantKeys.Production or CowpayConstantKeys.SandBox
        intent.putExtra(CowpayConstantKeys.PaymentEnvironment, paymentEnvironment)
        //set locale language
        var locale = CowpayConstantKeys.ENGLISH
        intent.putExtra(CowpayConstantKeys.Language, locale)
        CowpayConstantKeys.LanguageCode = locale
        //merchant data
        intent.putExtra(CowpayConstantKeys.MerchantCode, merchantCode)
        intent.putExtra(
            CowpayConstantKeys.MerchantHashKey,
            merchantHashKey
        )
        //order id
        intent.putExtra(CowpayConstantKeys.MerchantReferenceId, getRandomNumber().toString())
        //order price780
        intent.putExtra(CowpayConstantKeys.Amount, amount)
        //user data
        intent.putExtra(CowpayConstantKeys.CustomerName, "John Smith")
        intent.putExtra(CowpayConstantKeys.CustomerMobile, "01234567890")
        intent.putExtra(CowpayConstantKeys.CustomerEmail, "customer@customer.com")
        intent.putExtra(CowpayConstantKeys.Description, "example description")
        //user id
        intent.putExtra(CowpayConstantKeys.CustomerMerchantProfileId, "15")
        startActivityForResult(intent, CowpayConstantKeys.PaymentMethodsActivityRequestCode)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == CowpayConstantKeys.PaymentMethodsActivityRequestCode && data != null && resultCode == Activity.RESULT_OK) {
            var responseCode = data.extras!!.getInt(CowpayConstantKeys.ResponseCode, 0)
            var paymentMethod = data.extras!!.getString(CowpayConstantKeys.PaymentMethod)
            if (responseCode == CowpayConstantKeys.ErrorCode) {
                var responseMSG = data.extras!!.getString(CowpayConstantKeys.ResponseMessage)
                Toast.makeText(this@MainActivity, "$responseMSG $paymentMethod", Toast.LENGTH_LONG)
                    .show()
            } else if (responseCode == CowpayConstantKeys.SuccessCode) {
                var responseMSG = data.extras!!.getString(CowpayConstantKeys.ResponseMessage)
                var paymentGatewayReferenceId =
                    data.extras!!.getString(CowpayConstantKeys.PaymentGatewayReferenceId)
                Toast.makeText(
                    this@MainActivity,
                    responseMSG.plus(" $paymentMethod $paymentGatewayReferenceId"),
                    Toast.LENGTH_LONG
                )
                    .show()
            }
        }
        openPaymentList()
    }
}