/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dimensaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Tales
 */
public class DimensaoDaTela {

    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução do seu sistema é ->: "+ d.width + "X" + d.height);
        System.out.println("  ");
    }
}
