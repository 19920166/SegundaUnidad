package Bridge

interface IEncryptAlgorithm {
    fun encrypt(message:String, password:String): String
}

