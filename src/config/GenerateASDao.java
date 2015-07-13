package config;

import java.lang.reflect.Field;

import jcolibri.CaseDescription;
import jcolibri.CaseSolution;

import model.CBRCase;
import model.DefectsSheet;
import model.Metallware;
import model.Passport;
import model.Resistance;
import model.Visual;

//Генерируем переменные классов, геттеры и сеттеры для Flex ActionScript, используя рефлексию типов в Java

public class GenerateASDao {
	
	public static void main(String[] args){
		
		CaseDescription caseDesc = new CaseDescription();
		CaseSolution caseSol = new CaseSolution();
		Metallware m = new Metallware();
		Visual v = new Visual();
		Resistance r = new Resistance();
		Passport p = new Passport();
		DefectsSheet d = new DefectsSheet();
		CBRCase c = new CBRCase();
		
		Object[] arr = new Object[8];
		arr[0] = caseDesc;
		arr[1] = caseSol;
		arr[2] = m;
		arr[3] = v;
		arr[4] = r;
		arr[5] = p;
		arr[6] = d;
		arr[7] = c;
		
		for (Object o : arr) {
			System.out.println("\n//-------------"+o.getClass()+"-----------------------------\n");
			
			
			//Сначала можно делать отдельно список переменных
			for(Field field : o.getClass().getDeclaredFields()) {
	            				
				if ((field.getType().getName().equals("double")) || (field.getType().getName().equals("int")) || (field.getType().getName().equals("long")))
				{
					System.out.println("private var _"+field.getName()+": Number;");
				
				}else if(field.getType().getName().equals("java.lang.String"))
				{
					System.out.println("private var _"+field.getName()+": String;");
				}else if (field.getType().getName().equals("boolean"))
				{
					System.out.println("private var _"+field.getName()+": Boolean;");
				}else if (field.getType().getName().equals("java.util.Date"))
				{
					System.out.println("private var _"+field.getName()+": Date;");
				}else{
					System.out.println("private var _"+field.getName()+": "+field.getType().getName()+"----------------------------CAUTION!");
				}
				
				
			}
			
			System.out.println("\n//-------------Getters & Setters-----------------------------\n");
			
			//...а затем - геттеры и сеттеры
			for(Field field : o.getClass().getDeclaredFields()) {
				
				if ((field.getType().getName().equals("double")) || (field.getType().getName().equals("int")) || (field.getType().getName().equals("long"))) 
				{
					
					System.out.println("public function get "+field.getName()+"():Number");
					System.out.println("{");
					System.out.println("\treturn _"+field.getName()+";");
					System.out.println("}");
					System.out.println("public function set "+field.getName()+"(value: Number): void");
					System.out.println("{");
					System.out.println("\t _"+field.getName()+" = value;");
					System.out.println("}");
					
				}else if(field.getType().getName().equals("java.lang.String"))
				{
					System.out.println("public function get "+field.getName()+"():String");
					System.out.println("{");
					System.out.println("\treturn _"+field.getName()+";");
					System.out.println("}");
					System.out.println("public function set "+field.getName()+"(value: String): void");
					System.out.println("{");
					System.out.println("\t _"+field.getName()+" = value;");
					System.out.println("}");
				}else if (field.getType().getName().equals("boolean"))
				{
					System.out.println("public function get "+field.getName()+"(): Boolean");
					System.out.println("{");
					System.out.println("\treturn _"+field.getName()+";");
					System.out.println("}");
					System.out.println("public function set "+field.getName()+"(value: Boolean): void");
					System.out.println("{");
					System.out.println("\t _"+field.getName()+" = value;");
					System.out.println("}");
				}else if (field.getType().getName().equals("java.util.Date"))
				{
					System.out.println("public function get "+field.getName()+"(): Date");
					System.out.println("{");
					System.out.println("\treturn _"+field.getName()+";");
					System.out.println("}");
					System.out.println("public function set "+field.getName()+"(value: Date): void");
					System.out.println("{");
					System.out.println("\t _"+field.getName()+" = value;");
					System.out.println("}");
				}else{
					System.out.println("public function get "+field.getName()+"(): Object");
					System.out.println("{");
					System.out.println("\treturn _"+field.getName()+";");
					System.out.println("}");
					System.out.println("public function set "+field.getName()+"(value: Object): void");
					System.out.println("{");
					System.out.println("\t _"+field.getName()+" = value;");
					System.out.println("}");
				}
				
				
			}
			System.out.println("\n//-------------КОНСТРУКТОР-----------------------------\n");
			//Сделаем конструктор без параметров, присваивающий всем Number параметрам значение 0. Чтобы не было NaN
			System.out.println("public function "+o.getClass()+"()");
			System.out.println("{");
			for(Field field : o.getClass().getDeclaredFields()) {
				if (field.getType().getName().equals("java.lang.String"))
				{
					System.out.println("\t_"+field.getName()+" = \"\";" ); //System.out.print("\"Hello\"");
				}else if ((field.getType().getName().equals("double")) || (field.getType().getName().equals("int")) || (field.getType().getName().equals("long")))
				{
					System.out.println("\t_"+field.getName()+" = 0;" );
				}else if (field.getType().getName().equals("java.util.Date"))
				{
					System.out.println("\t_"+field.getName()+" = new Date();" ); 
				}else 
				{
					System.out.println("\t_"+field.getName()+" = Object;" );
				}
				
			}
			System.out.println("}");
			
			
			System.out.println("\n//-----------------------------------------------------\n");
			System.out.println("\n//-------------ArrayCollection для Flex----------------\n");
			System.out.println("private static var "+o.getClass().getSimpleName().toLowerCase()+": ArrayCollection = new ArrayCollection([ ");
			for(Field field : o.getClass().getDeclaredFields()) {
				System.out.println("{header:\"\",\t\tfield: \""+field.getName()+"\"},"); //следить за последней запятой!
			}
			System.out.println("]);\tследить за последней запятой!");
			
			System.out.println("\n//-----------------------------------------------------\n");
			System.out.println("\n//-------------ac.addItem({ для Flex----------------\n");
			for(Field field : o.getClass().getDeclaredFields()) {
				System.out.println(field.getName()+":\t item._case.description."+o.getClass().getSimpleName().toLowerCase()+"."+field.getName()+","); 
				//следить за последней запятой и корректностью item._case.description.
			}
			System.out.println("следить за последней запятой и корректностью item._case.*.*");
						
		}
		
	}

}
