package com.zoho.crm.api.record;

import com.zoho.crm.api.record.Record;
import com.zoho.crm.api.util.Model;
import java.util.List;

public class InventoryLineItems extends Record implements Model
{

	/**
	 * The method to get the value of product
	 * @return An instance of LineItemProduct
	 */
	public LineItemProduct getProduct()
	{
		return (LineItemProduct) this.getKeyValue("product");

	}

	/**
	 * The method to set the value to product
	 * @param product An instance of LineItemProduct
	 */
	public void setProduct(LineItemProduct product)
	{
		 this.addKeyValue("product", product);

	}

	/**
	 * The method to get the value of quantity
	 * @return An instance of Double
	 */
	public Double getQuantity()
	{
		return (Double) this.getKeyValue("quantity");

	}

	/**
	 * The method to set the value to quantity
	 * @param quantity An instance of Double
	 */
	public void setQuantity(Double quantity)
	{
		 this.addKeyValue("quantity", quantity);

	}

	/**
	 * The method to get the value of discount
	 * @return A String representing the discount
	 */
	public String getDiscount()
	{
		return (String) this.getKeyValue("Discount");

	}

	/**
	 * The method to set the value to discount
	 * @param discount A String representing the discount
	 */
	public void setDiscount(String discount)
	{
		 this.addKeyValue("Discount", discount);

	}

	/**
	 * The method to get the value of totalAfterDiscount
	 * @return An instance of Double
	 */
	public Double getTotalAfterDiscount()
	{
		return (Double) this.getKeyValue("total_after_discount");

	}

	/**
	 * The method to set the value to totalAfterDiscount
	 * @param totalAfterDiscount An instance of Double
	 */
	public void setTotalAfterDiscount(Double totalAfterDiscount)
	{
		 this.addKeyValue("total_after_discount", totalAfterDiscount);

	}

	/**
	 * The method to get the value of netTotal
	 * @return An instance of Double
	 */
	public Double getNetTotal()
	{
		return (Double) this.getKeyValue("net_total");

	}

	/**
	 * The method to set the value to netTotal
	 * @param netTotal An instance of Double
	 */
	public void setNetTotal(Double netTotal)
	{
		 this.addKeyValue("net_total", netTotal);

	}

	/**
	 * The method to get the value of book
	 * @return An instance of Double
	 */
	public Double getBook()
	{
		return (Double) this.getKeyValue("book");

	}

	/**
	 * The method to set the value to book
	 * @param book An instance of Double
	 */
	public void setBook(Double book)
	{
		 this.addKeyValue("book", book);

	}

	/**
	 * The method to get the value of tax
	 * @return An instance of Double
	 */
	public Double getTax()
	{
		return (Double) this.getKeyValue("Tax");

	}

	/**
	 * The method to set the value to tax
	 * @param tax An instance of Double
	 */
	public void setTax(Double tax)
	{
		 this.addKeyValue("Tax", tax);

	}

	/**
	 * The method to get the value of listPrice
	 * @return An instance of Double
	 */
	public Double getListPrice()
	{
		return (Double) this.getKeyValue("list_price");

	}

	/**
	 * The method to set the value to listPrice
	 * @param listPrice An instance of Double
	 */
	public void setListPrice(Double listPrice)
	{
		 this.addKeyValue("list_price", listPrice);

	}

	/**
	 * The method to get the value of unitPrice
	 * @return An instance of Double
	 */
	public Double getUnitPrice()
	{
		return (Double) this.getKeyValue("unit_price");

	}

	/**
	 * The method to set the value to unitPrice
	 * @param unitPrice An instance of Double
	 */
	public void setUnitPrice(Double unitPrice)
	{
		 this.addKeyValue("unit_price", unitPrice);

	}

	/**
	 * The method to get the value of quantityInStock
	 * @return An instance of Double
	 */
	public Double getQuantityInStock()
	{
		return (Double) this.getKeyValue("quantity_in_stock");

	}

	/**
	 * The method to set the value to quantityInStock
	 * @param quantityInStock An instance of Double
	 */
	public void setQuantityInStock(Double quantityInStock)
	{
		 this.addKeyValue("quantity_in_stock", quantityInStock);

	}

	/**
	 * The method to get the value of total
	 * @return An instance of Double
	 */
	public Double getTotal()
	{
		return (Double) this.getKeyValue("total");

	}

	/**
	 * The method to set the value to total
	 * @param total An instance of Double
	 */
	public void setTotal(Double total)
	{
		 this.addKeyValue("total", total);

	}

	/**
	 * The method to get the value of productDescription
	 * @return A String representing the productDescription
	 */
	public String getProductDescription()
	{
		return (String) this.getKeyValue("product_description");

	}

	/**
	 * The method to set the value to productDescription
	 * @param productDescription A String representing the productDescription
	 */
	public void setProductDescription(String productDescription)
	{
		 this.addKeyValue("product_description", productDescription);

	}

	/**
	 * The method to get the value of lineTax
	 * @return An instance of List<LineTax>
	 */
	public List<LineTax> getLineTax()
	{
		return (List<LineTax>) this.getKeyValue("line_tax");

	}

	/**
	 * The method to set the value to lineTax
	 * @param lineTax An instance of List<LineTax>
	 */
	public void setLineTax(List<LineTax> lineTax)
	{
		 this.addKeyValue("line_tax", lineTax);

	}
}