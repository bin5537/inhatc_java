package week07;

public class PetEx {
	public static void main(String[] args) {
		Pet pet1 = new Pet("바둑이", "강아지", 3, "하얀색");
		System.out.printf("====== 애완동물 정보 \n이름: %s \n종류: %s \n나이: %d살\n색상: %s \n", pet1.name, pet1.type, pet1.age, pet1.color);
		
		Pet pet2 = new Pet("구름이", "송아지");
		System.out.printf("====== 애완동물 정보 \n이름: %s \n종류: %s \n나이: %d살\n색상: %s \n", pet2.name, pet2.type, pet2.age, pet2.color);
	}
}
