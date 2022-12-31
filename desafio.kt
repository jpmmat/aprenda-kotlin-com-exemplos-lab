// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }
// criar uma classe para usuario com alguns dados
class Usuario(val nome: String, val email: String, val senha: String, val nivelConhecimento: Nivel)


data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivelDificuldade: Nivel, var conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
	 //inserindo novos inscrintos pela funcao matricular
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
    }
    
    fun getInscritosOrdenadosPorNivelConhecimento(): List<Usuario> {
	    // ordenar os incrintos por nivel
        return inscritos.sortedBy { it.nivelConhecimento }
    }
}


fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    // os conteudos progamados
    val conteudo1 = ConteudoEducacional("Introdução à programação")
    val conteudo2 = ConteudoEducacional("Estruturas de dados", 90)
    val conteudo3 = ConteudoEducacional("Algoritmos de ordenação")
    
    val formacao1 = Formacao("Curso de programação", Nivel.INTERMEDIARIO, listOf(conteudo1, conteudo2, conteudo3))
    
    val inscritosOrdenados = formacao1.getInscritosOrdenadosPorNivelConhecimento()
    
    val usuario1 = Usuario("João", "joao@email.com", "senha123", Nivel.INTERMEDIARIO)
    val usuario2 = Usuario("Maria", "maria@email.com", "senha456",  Nivel.DIFICIL)
    val usuario3 = Usuario("Pedro", "pedro@email.com", "senha789",  Nivel.BASICO)
    
	
    
	formacao1.matricular(usuario1)
	formacao1.matricular(usuario2)
	formacao1.matricular(usuario3)
    
}
