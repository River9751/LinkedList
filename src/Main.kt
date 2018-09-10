fun main(args: Array<String>) {

    Single.addNode("A")
    Single.addNode("B")
    Single.addNode("C")
    Single.addNode("D")

    Single.removeNode("A")

    Single.addNode("E")
    Single.showList()
}