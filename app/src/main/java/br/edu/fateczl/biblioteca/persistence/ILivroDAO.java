/**
 *@author:<ANA PAULA DE OLIVEIRA SILVA>
 *RA1110482123028
 *ANA PAULA DE OLIVEIRA SILVA
 */


package br.edu.fateczl.biblioteca.persistence;

import java.sql.SQLException;

public interface ILivroDAO {
    public LivroDAO abrir() throws SQLException;

    public void fechar();
}
