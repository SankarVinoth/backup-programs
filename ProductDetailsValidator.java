package in.sankarvinoth.util.validator;




import in.sankarvinoth.model.Product;

public class ProductDetailsValidator {
	

	private ProductDetailsValidator() {
		
	}

	public static boolean productValidator(Product product) {
		boolean isvalidProductId=StringValidator.isValidString(product.getProductId()); 
		boolean isValidProductName=StringValidator.isValidString(product.getProductName());
		boolean isValidQuantity=NumberValidator.numberValidation(product.getQuantity());
		boolean isvalidCategory=StringValidator.isValidString(product.getCategory());
		boolean isValidPrice= NumberValidator.numberValidation(product.getAmount());
		boolean isvalidStatus=StringValidator.isValidString(product.getStatus());
		
		return (isvalidProductId && isValidProductName && isValidQuantity &&  isvalidCategory && isValidPrice &&  isvalidStatus); 
   }
	
	
}
