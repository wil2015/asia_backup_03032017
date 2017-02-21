package com.asia.frete.relatoriodefretev03;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class tbl_item implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "TBL_ITEM_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "TBL_ITEM_ID_GENERATOR", sequenceName = "TBL_ITEM_ID_SEQ")
   private java.lang.Long id;

   private java.lang.Integer chave_controle;

   private java.lang.Integer cd_empresa;

   private java.lang.String cd_roteiro;

   private java.lang.Integer ano_roteiro;

   private java.lang.Integer nr_pedido;

   private java.lang.Integer nr_item;

   private java.util.Date dt_vencto;

   private java.math.BigDecimal cambio;

   private java.math.BigDecimal valor_dolar;

   private java.math.BigDecimal vl_real;

   private java.math.BigDecimal valor_taxa;

   private java.lang.String nome_taxa;

   public tbl_item()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.Integer getChave_controle()
   {
      return this.chave_controle;
   }

   public void setChave_controle(java.lang.Integer chave_controle)
   {
      this.chave_controle = chave_controle;
   }

   public java.lang.Integer getCd_empresa()
   {
      return this.cd_empresa;
   }

   public void setCd_empresa(java.lang.Integer cd_empresa)
   {
      this.cd_empresa = cd_empresa;
   }

   public java.lang.String getCd_roteiro()
   {
      return this.cd_roteiro;
   }

   public void setCd_roteiro(java.lang.String cd_roteiro)
   {
      this.cd_roteiro = cd_roteiro;
   }

   public java.lang.Integer getAno_roteiro()
   {
      return this.ano_roteiro;
   }

   public void setAno_roteiro(java.lang.Integer ano_roteiro)
   {
      this.ano_roteiro = ano_roteiro;
   }

   public java.lang.Integer getNr_pedido()
   {
      return this.nr_pedido;
   }

   public void setNr_pedido(java.lang.Integer nr_pedido)
   {
      this.nr_pedido = nr_pedido;
   }

   public java.lang.Integer getNr_item()
   {
      return this.nr_item;
   }

   public void setNr_item(java.lang.Integer nr_item)
   {
      this.nr_item = nr_item;
   }

   public java.util.Date getDt_vencto()
   {
      return this.dt_vencto;
   }

   public void setDt_vencto(java.util.Date dt_vencto)
   {
      this.dt_vencto = dt_vencto;
   }

   public java.math.BigDecimal getCambio()
   {
      return this.cambio;
   }

   public void setCambio(java.math.BigDecimal cambio)
   {
      this.cambio = cambio;
   }

   public java.math.BigDecimal getValor_dolar()
   {
      return this.valor_dolar;
   }

   public void setValor_dolar(java.math.BigDecimal valor_dolar)
   {
      this.valor_dolar = valor_dolar;
   }

   public java.math.BigDecimal getVl_real()
   {
      return this.vl_real;
   }

   public void setVl_real(java.math.BigDecimal vl_real)
   {
      this.vl_real = vl_real;
   }

   public java.math.BigDecimal getValor_taxa()
   {
      return this.valor_taxa;
   }

   public void setValor_taxa(java.math.BigDecimal valor_taxa)
   {
      this.valor_taxa = valor_taxa;
   }

   public java.lang.String getNome_taxa()
   {
      return this.nome_taxa;
   }

   public void setNome_taxa(java.lang.String nome_taxa)
   {
      this.nome_taxa = nome_taxa;
   }

   public tbl_item(java.lang.Long id, java.lang.Integer chave_controle,
         java.lang.Integer cd_empresa, java.lang.String cd_roteiro,
         java.lang.Integer ano_roteiro, java.lang.Integer nr_pedido,
         java.lang.Integer nr_item, java.util.Date dt_vencto,
         java.math.BigDecimal cambio, java.math.BigDecimal valor_dolar,
         java.math.BigDecimal vl_real, java.math.BigDecimal valor_taxa,
         java.lang.String nome_taxa)
   {
      this.id = id;
      this.chave_controle = chave_controle;
      this.cd_empresa = cd_empresa;
      this.cd_roteiro = cd_roteiro;
      this.ano_roteiro = ano_roteiro;
      this.nr_pedido = nr_pedido;
      this.nr_item = nr_item;
      this.dt_vencto = dt_vencto;
      this.cambio = cambio;
      this.valor_dolar = valor_dolar;
      this.vl_real = vl_real;
      this.valor_taxa = valor_taxa;
      this.nome_taxa = nome_taxa;
   }

}