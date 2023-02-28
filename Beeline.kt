class Beeline(): MobileOperator() {
    override var name = "Сосна"
    override var costOfPayment:Byte = 100
    override var coverageArea: Float =  1.13F
    override var Q: Float = 1.0F
    var Qp: Float = 1.0F
    var payment:Boolean = true
    constructor(_name:String): this(){
        name = _name
    }
    constructor(_name:String, _costOfPayment:Byte): this(_name){
        costOfPayment = _costOfPayment
    }
    constructor(_name:String, _costOfPayment:Byte, _coverageArea: Float): this(_name, _costOfPayment){
        coverageArea = _coverageArea
    }
    override fun info():String = "$name по цене 1 минуты разговора: $costOfPayment, площадь охватат: $coverageArea"
    override fun calculationOfQ(){
        Q = 100F*coverageArea/costOfPayment
        println("Качество:$Q")
    }
    open fun paymentVerification(){
        if(payment == true)
        {
            Qp = 0.7F*Q
            println(Qp)
        }
        else
        {
            Qp = 1.5F*Q
            println(Qp)
        }
    }
}