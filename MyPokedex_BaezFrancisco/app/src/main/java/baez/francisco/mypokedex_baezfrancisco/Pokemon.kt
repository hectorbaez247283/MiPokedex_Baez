package baez.francisco.mypokedex_baezfrancisco

data class Pokemon(
    var nombrePokemon: String = "",
    var numPokedex: String = "",
    var imgPokemon: String = ""
) {
    constructor() : this("", "", "")
}
