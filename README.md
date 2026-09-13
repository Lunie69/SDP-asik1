1. Project: SDP-asik1 | CheremshaBuilder <br>
2. Product - Cheremsha: is a herb, a wild plant that resembles an onion. Various salads, sauces, pies, and soups are made from cheremsha. <br>
You can also eat wild garlic in its pure form, adding sauces and making a salad with it. <br> <br>
3. The Builder in my project is CheremshaCooker <br>
It builds Cheremsha product with methods like setWeight, setSause and others. <br> <br>
4. The Product in my project is Cheremsha. <br>
It represents the final prepared Cheremsha object. Also it containts: <br>
* Weight <br>
* Price <br>
* Sause <br>
* Spicy level <br>
* And a freshness level <br>
Product created when the .build() is called. <br> <br>
5. The Director in my project is CheremshaDirector. <br>
It contains predefined configurations for creating different types of Cheremsha. <br>
So we can call already known Cheremsha like director.buildSpicyCheremsha(); <br> <br>
6. The Client in my project is defolt main class <br>
Why? Because of it's using CheremshaDirector to create different Cheremsha and prints them to the console <br>
Cheremsha spicyCheremsha = director.buildSpicyCheremsha(); <br>
System.out.println("Spicy Cheremsha:"); <br>
        System.out.println(spicyCheremsha); <br> <br>
7. My project has multiple representations: spicyCheremsha, cheapCheremsha, firmenayaCheremsha. <br> <br>
8. Chaining - my builder uses chaining method like: <br>
new CheremshaCooker() <br>
  .setWeight(3) <br>
  .setSause("Hot & Spicy") <br>
  .setFreshness("Normal") <br>
  .setSpicyLvl("Maximum") <br>
  .setPrice(4500) <br>
  .build(); <br> <br>
9. 5 Clean code principles: <br>
- Meaningful names: before & after <img width="848" height="161" alt="{F31F6052-74EC-4305-85E0-3577394811C3}" src="https://github.com/user-attachments/assets/b6c3ecae-0369-4412-9e20-c127013f7220" /> <br>
<img width="777" height="142" alt="{4B49AB5E-1AFA-4DEB-8025-A8A5EB3A3ABC}" src="https://github.com/user-attachments/assets/b37585b9-3bd3-46e5-a3ef-560ab850e57e" /> <br> It is obvious that we working with Weight of product, not just unknown x <br>
- Small methods: before & after <img width="780" height="160" alt="{5BFFDC6B-7008-4CB9-B99B-B00E0B33B702}" src="https://github.com/user-attachments/assets/714dbd4e-0fb1-401d-881f-50cef3150769" /> <br>
<img width="759" height="134" alt="{CB507E3E-52EE-41A9-8FD1-70B3D660E1D9}" src="https://github.com/user-attachments/assets/99d69c72-15e9-4b4f-9e5c-46e5fa6a4307" />
<br> Every method related to only one function! <br>
- Consistent formatting and small, focused classes: 2 different responsibility <br>
CheremshaDirector only for configuration, while main has no that logic. <img width="727" height="271" alt="{8976550D-FD46-4BB8-8251-4F8B906C6F2A}" src="https://github.com/user-attachments/assets/631a2d0b-78da-4bb8-8426-9a959206e164" /> <br>
<img width="692" height="290" alt="{392D8205-F156-4F9A-8519-494DAAF9D699}" src="https://github.com/user-attachments/assets/0d4a07ce-5490-403b-8c47-019f09e35e02" />
<br>
- Validated Construction: before & after <img width="623" height="91" alt="{B4613929-411E-4AEB-9B7E-0C8ACDB84B7A}" src="https://github.com/user-attachments/assets/96d9d9bf-894d-4793-8585-978b5433a7d1" /> <br>
<img width="735" height="159" alt="{83F4592F-9D48-4215-B4B7-BF747C3D1EEC}" src="https://github.com/user-attachments/assets/32c127bf-ef1f-4a86-9e5d-650326adbfe1" />
<br> Builedr do not allow to create an object with uncorrect data. <br>
- No magic numbers/strings: before & after <img width="941" height="36" alt="{F548086E-6F6D-4C02-970E-8A282DCF8EB2}" src="https://github.com/user-attachments/assets/6d6322dd-38f1-4f46-b137-da9f8cd1900e" /> <br>
<img width="297" height="190" alt="{9CFD20B1-B9E8-45EE-BE07-595FF74C700B}" src="https://github.com/user-attachments/assets/6a9e122f-12af-4747-88d5-94b7aa18093e" />
<br> It is much more easire to read code like this. <br> <br>
10. How to Run? <br>
* Open the project in IntelliJ IDEA.<br>
* Open Main.java.<br>
* Run the main() method.<br>
* The program will create three different Cheremsha objects.<br>
* The results will be displayed in the console.<br>
Examples: <br>
<img width="1920" height="426" alt="{6051518C-FA10-475C-B1E8-462143B9C19E}" src="https://github.com/user-attachments/assets/64ba2281-9a73-46d0-b9d6-92a948c32525" /> <br>
<img width="1920" height="1080" alt="{4E8E584B-704C-4D6D-80EC-FFBEDE6B4AFF}" src="https://github.com/user-attachments/assets/27f16dc3-cf18-451b-8e4d-0f03bafe10eb" />






