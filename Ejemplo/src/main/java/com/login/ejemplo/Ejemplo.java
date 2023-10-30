/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.login.ejemplo;

import java.sql.Connection;

public class Ejemplo {
    public static void main(String[] args) {
        DatabaseManager databaseManager = new DatabaseManager();
        Connection connection = databaseManager.getConnection();

        // Ahora puedes usar 'connection' para interactuar con la base de datos.
    }
}
