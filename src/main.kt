fun main(){
    friends(arrayOf("nyawera","Tessa","Naima","Anjela"))
    countries()
    num()
    var jina=name(arrayOf("Neima","Marie","Anjela"))
    println(jina)


}
fun friends(names:Array<String>){
    println(names.contentToString())

}
fun countries() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    cities.sortedArray().forEach { wera ->
        println(wera.capitalize())
    }
}
    fun num(){
        var numArray = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
        var sum=numArray[1].plus(numArray[4])
        println(sum)
        var index = numArray.indexOf(158)
        println(index)

        var sortedNums= numArray.sortedArray()
        println(sortedNums.contentToString())

    }
fun name(names: Array<String>):String{
    var tut=names.contentToString()
    return(tut)




}










