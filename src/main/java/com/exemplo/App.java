package com.exemplo;

/**
 * Hello world!
 */
public class App 
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
    }

    // Método de confirmação de senha
    public static boolean confirmarSenha(String senha, String confirmar) {
        return senha != null && senha.equals(confirmar);
    }
}

