package io.github.gabrielsystem.mineplex.remake.util

object UtilText {
    fun <T> listToString(inputList: Collection<T>, comma: Boolean): String {
        var out = ""
        for (cur in inputList) {
            out += cur.toString() + if (comma) ", " else " "
        }
        if (out.length > 0) {
            out = out.substring(0, out.length - if (comma) 2 else 1)
        }
        return out
    }

    fun upperCaseCount(input: String): Int {
        var count = 0
        for (k in 0 until input.length) {
            val ch = input[k]
            if (Character.isUpperCase(ch)) count++
        }
        return count
    }

    fun lowerCaseCount(input: String): Int {
        var count = 0
        for (k in 0 until input.length) {
            val ch = input[k]
            if (Character.isLowerCase(ch)) count++
        }
        return count
    }

    fun isStringSimilar(newString: String, oldString: String, matchRequirement: Float): Boolean {
        if (newString.length <= 3) {
            return newString.toLowerCase() == oldString.toLowerCase()
        }
        var i = 0
        while (i < newString.length * matchRequirement) {
            var matchFromIndex = 0

            //Look for substrings starting at i
            for (j in 0 until oldString.length) {
                //End of newString
                if (i + j >= newString.length) {
                    break
                }

                //Matched
                if (newString[i + j] == oldString[j]) {
                    matchFromIndex++
                    if (matchFromIndex >= newString.length * matchRequirement) return true
                } else {
                    break
                }
            }
            i++
        }
        return false
    }
}
