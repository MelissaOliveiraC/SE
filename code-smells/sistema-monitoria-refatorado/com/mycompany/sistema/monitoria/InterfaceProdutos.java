package com.mycompany.sistema.monitoria;

/**
 * Interface para representar os métodos necessários para manipular produtos.
 * Cada produto deve implementar esta interface para definir a quantidade, peso,
 * valor subtotal, nome e subtotal do produto.
 */
public interface InterfaceProdutos {
  
    // Define a quantidade do produto.
    void quantidade();

   
    // Define o peso do produto.    
    void peso();


    // Calcula e define o valor subtotal do produto.
    void valor_subtotal();


    // Retorna o nome do produto.
    String getNome();

   
    // Retorna o valor subtotal do produto.
    float getSubtotal();
}
