package conta;

import java.util.Scanner;

public class Entrar {

    // Método para verificar login
    public static void verificar(Scanner scanner, String[] usuarios, String[] senhas) {
        System.out.print("Informe seu usuário: ");
        String usuarioDigitado = scanner.nextLine();

        System.out.print("Informe sua senha: ");
        String senhaDigitada = scanner.nextLine();

        // Verificar se o usuário existe
        int verificar = -1;
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i].equals(usuarioDigitado)) {
                verificar = i;
                break;
            }
        }

        // Verifica se a senha também corresponde ao usuário encontrado
        if (verificar != -1 && senhas[verificar].equals(senhaDigitada)) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }
    }
}
