
package Modelo;


 private static Connection conn = null;
   private static String login = "superheroe";
   private static String clave = "superheroe";
   private static String url = "jdbc:oracle:thin:@localhost:1521:XE";
   
     public static Connection getConnection() throws SQLException{
       try {
           Class.forName("oracle.jdbc.driver.OracleDriver");//Llamado al driver de la conexion
           conn = DriverManager.getConnection(url, login, clave);
           conn.setAutoCommit(false);
           if(conn != null){
               System.out.print("\nApertura de Conexion OK");
           }else{
               System.err.print("No se ha realizado la conexion");           
           }          
       } catch (ClassNotFoundException|SQLException e) {
           JOptionPane.showMessageDialog(null, "Conexion Erronea");
       }      
       return conn;
   }
   
   //Metodo de cierre de la conexion
   public void CloseConection(){
       try {
           conn.close();
       } catch (SQLException e) {
           System.out.println("Error en el cierre de la conexion" + e.getMessage());
       }
   
   } 