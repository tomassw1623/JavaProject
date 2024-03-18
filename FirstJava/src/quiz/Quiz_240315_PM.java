package quiz;

public class Quiz_240315_PM {

    public static void main(String[] args) {
        // Test 코드
//		b1.cash = 500000;
//		b1.addToCart(new Coffee(10000, "이디야 원두"));
//		b1.addToCart(new Coffee(15000, "커피빈 원두"));
//		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
//		b1.addToCart(new Coffee(10000, "이디야 원두"));
//		b1.addToCart(new Coffee(15000, "커피빈 원두"));
//		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
//		b1.addToCart(new Coffee(10000, "이디야 원두"));
//		b1.addToCart(new Coffee(15000, "커피빈 원두"));
//		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
//		b1.addToCart(new Coffee(10000, "이디야 원두"));
//		b1.addToCart(new Coffee(15000, "커피빈 원두"));
//		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
//		b1.addToCart(new Coffee(10000, "이디야 원두"));
//		b1.addToCart(new Coffee(15000, "커피빈 원두"));
//		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
//		b1.addToCart(new Coffee(10000, "이디야 원두"));
//		b1.addToCart(new Coffee(15000, "커피빈 원두"));
//		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
//		b1.addToCart(new Vaccine(69000, "V3"));
//		
//		b1.buyAll();
//		System.out.println("============= 카트 정보 ================");
//		b1.viewCart();
//		System.out.println("============= 트렁크 정보 ==============");
//		b1.viewTrunk();
//		b1.addToCart(new Coffee(15000,"커피빈 원두"));
//		b1.buyAll();
//		
//		b1.receipt();
//		
//		for (int i = 0; i <b1.t_index;i++) {
//			Product p = b1.trunk[i];
//			
//			if (p instanceof Vaccine) {
//				Vaccine v = (Vaccine)p;
//				v.checkComputer();
//			}else if(p instanceof Coffee) {
//				Coffee c = (Coffee)p;
//				c.drink();						
//			}else {
//				
//			}
//			
//		}

		// 테스트 코드
		Buyer b1 = new Buyer();
        b1.addToCart(new Coffee(10000, "이디야 원두"));
        b1.addToCart(new Coffee(15000, "커피빈 원두"));
        b1.addToCart(new Coffee(20000, "스타벅스 원두"));
        b1.buyAll();
        System.out.println("============= 카트 정보 ================");
        b1.viewCart();
        System.out.println("============= 트렁크 정보 ==============");
        b1.viewTrunk();
    }

}


class Buyer {
    /*
     *  Buyer의 인스턴스 변수(상태)
     *   필요한 만큼 사용해보세요.
     */
// 구매자 클래스
private int cash = 500000;
private Product[] cart = new Product[10]; // 장바구니
private Product[] trunk = new Product[10];
private int cartIndex = 0;
private int trunkIndex = 0;

// 트렁크 출력 메서드
public void viewTrunk() {
	System.out.println("========= 장바구니 정보 =========");
	for (int i = 0; i < trunkIndex;i++) {
		System.out.println(trunk[i].getName());
	}
	
}
// 장바구니에 물건 추가하는 메서드
public void addToCart(Coffee coffee) {
	System.out.println("장바구니에 넣기");
	for (int i = 0; i < trunkIndex;i++) {
		System.out.println(trunk[i].getName());
	}
	
}// 장바구니 출력 메서드
public void viewCart() {
	System.out.println("========= 카트 정보 =========");
    for (int i = 0; i < cartIndex; i++) {
    System.out.println(cart[i].getName() + " : " + cart[i].getPrice() + "원");
    }
}
public void buyAll() {
	System.out.println("모두 구매");
	
}


    /*
     * 	Buyer의 기능(method)
     *  1. 메서드명 : buy
     *     기능 : 지정한 물건(Product)을 구입한다.
     *       바이어의 돈(cash)에서 물건의 가격을 빼고,
     *       내 트렁크(trunk)에 담는다
     *       만약 가진 돈이 부족하다면 구매할 수 없다.
     *     리턴타입 : 없음
     *     매개변수 : Product p
     *
     */

    /*
     *  2. 메서드 명 : buyAll
     *     기능 : 장바구니(cart)에 지정된 모든 물건을 구매(buy)한다.
     *     리턴타입 : 없음
     *     매개변수 : 없음, Product[] cart
     *
     */


    /*
     * 	3. 메서드 명 : addToCart
     *     기능 : 지정한 물건을 장바구니에 담는다
     *          만약에 장바구니에 담을 공간이 부족하면
     *          장바구니 배열의 크기를 2배로 늘린 다음에 담는다.
     *     리턴타입 : 없음
     *     매개변수 : Product p
     */


    /*	4. 메서드 명 : cancel
     *     기능 : 지정한 물건을 장바구니에서 뺀다.
     *         뺀 곳에는 다시 물건을 담을 수 있어야 한다.
     *     리턴타입 : 없음
     *     매개변수 : int cart_index
     */

    /*  5. 매서드명 : receipt
     * 	     기능 : 바이어가 구매한 물건의 목록과 사용금액 남은 금액을 출력한다.
     *     리턴타입, 매개변수 : 없음
     */

}


/*	Product 클래스를 상속받아서 상품을 3개 이상 만들어 보세요!!!
 *  (단, Product 클래스를 변경하면 안됨!!!!)
 */
class Product {  // 부모 클래스 사용할 예정!!

    String name;
    private int price; // private : 내 클래스 내부에서만 사용하려고 함.

    public Product(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

// Coffee 클래스
class Coffee extends Product {
    public Coffee(int price, String name) {
        super(price);
        this.name = name;
    }

    public void drink() {
        System.out.println(name + "를 마십니다.");
    }
}

// Vaccine 클래스
class Vaccine extends Product {
    public Vaccine(int price, String name) {
        super(price);
        this.name = name;
    }

    public void checkComputer() {
        System.out.println(name + "를 확인합니다.");
    }
}

// Book 클래스
class Book extends Product {
    public Book(int price, String name) {
        super(price);
        this.name = name;
    }

    public void read() {
        System.out.println(name + "를 읽습니다.");
    }
}
