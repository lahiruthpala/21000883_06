object main1 extends App{
    def encription(n: Int, str: String): String = {
        if(n == 0 || str.length() == 0){
            str
        }else{
            if(str.charAt(0).isLetter){
                val base = if (str.charAt(0).isUpper) 'A' else 'a';
                (((str.charAt(0) - base + n) % 26 + base).toChar).toString() + encription(n, str.substring(1))
            }else{
                str.charAt(0).toString()
            }
        }
    }

    def decription(n: Int, str: String): String = {
        encription(26 - n, str: String)
    }

    println(encription(27, "ABC"))
    println(decription(27, "BCD"))

}