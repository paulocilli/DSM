public class Sistema {
    // ⚠️ VULNERABILIDADE: Senha exposta/Hardcoded no código!
    private String senhaBanco = "Admin123_Secret_Token!";

    public void processarUsuario(String usuario) {
        // ⚠️ BUG / NULL POINTER: Chamando método sem testar se é nulo
        int tamanhoNome = usuario.length(); 
        System.out.println("Tamanho: " + tamanhoNome);

        // ⚠️ CODE SMELL: Código duplicado e nomes ruins (x, tmp)
        int x = 10;
        int tmp = x + 5;
        System.out.println(tmp);

        int y = 10;
        int tmp2 = y + 5;
        System.out.println(tmp2);
    }
}
```[cite: 2]
