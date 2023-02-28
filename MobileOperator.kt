open abstract class MobileOperator:Operator {
    open abstract val name: String
    open abstract var costOfPayment: Byte
    open abstract val Q:Float
    abstract fun info(): String
    abstract fun calculationOfQ()

}