// !LANGUAGE: +BooleanElvisBoundSmartCasts
// See KT-20752

class Unstable {
    val first: String? get() = null
}

class StringList {
    fun remove(s: String) = s
}

fun StringList.remove(s: String?) = s ?: ""

fun String.isEmpty() = this == ""

fun foo(list: StringList, arg: Unstable) {
    list.remove(arg.first)
    if (arg.first?.isEmpty() ?: false) {
        // Ideally should have smart cast impossible here
        list.remove(arg.first)
    }
}
