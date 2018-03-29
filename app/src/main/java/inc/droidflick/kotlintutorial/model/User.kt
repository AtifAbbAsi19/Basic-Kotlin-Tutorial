package inc.droidflick.kotlintutorial.model

/**
 * Created by Muhammad Atif  on 3/8/2018.
 */
class User{

    var id: Int? = null
    var name: String? = null

    constructor(id: Int?, name: String?) {
        this.id = id
        this.name = name
    }

}