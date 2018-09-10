object Single {
    private var head: SingleNode? = null
    private var current: SingleNode? = null

    fun addNode(value: String) {
        if (head == null) { //第一個 node
            var node = SingleNode(value)
            head = node
        } else { //後續加入的 node
            current = head //從 head 開始檢查
            while (current!!.next != null) {
                current = current!!.next
            }
            var node = SingleNode(value)
            current!!.next = node
        }
    }

    fun removeNode(value: String) {
        current = head

        while (current!!.next != null) {
            //如果刪除的是 header
            if (head!!.value == value) {
                head = current!!.next
                current = null
                return
            }
            if (current!!.next!!.value == value) {
                val previousNode = current
                val deleteNode = current!!.next
                val nextNodeNode = deleteNode!!.next
                previousNode!!.next = nextNodeNode
                current = null
                break
            }
            current = current!!.next
        }
    }

    fun showList() {
        current = head
        while (current != null) {
            print(" ${current!!.value}")
            current = current!!.next
        }
    }
}


class SingleNode(value: String) {
    var value: String? = value
    var next: SingleNode? = null
}

