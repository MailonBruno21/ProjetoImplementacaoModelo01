package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    private Connection con;
    private static ConexaoBD instancia;
    
    private ConexaoBD() throws PersistenciaException{
        try{
            
            String url = "jdbc:postgresql://localhost:5432/academico";
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url,"postgres","123");        
        }catch (SQLException ex){
            throw new PersistenciaException("Erro ao conectar ao Banco de Dados - " + ex.toString());
        }catch(ClassNotFoundException ex){
            throw new PersistenciaException("Driver do Banco de Dados nao localizado - " + ex);
        }
    }
    
    public static ConexaoBD getInstancia() throws PersistenciaException{
        if (instancia == null){
            instancia = new ConexaoBD();
        }
        return instancia;
    }
    
    public Connection getConexao(){
        return con;
    }
    
    public void desconectar() throws PersistenciaException{
        try{
            con.close();
        }catch(SQLException ex){
            throw new PersistenciaException("Erro ao desconectar ao banco d e dados");
        }
    }
}
