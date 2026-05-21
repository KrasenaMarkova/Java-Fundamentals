package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
//On the first line of the standard input, you will receive an integer n – the number of heroes that you can choose for your party. On the next n lines, the heroes themselves will follow with their hit points and mana points separated by a single space in the following format:
//"{hero name} {HP} {MP}"
//-	HP stands for hit points and MP for mana points
//-	a hero can have a maximum of 100 HP and 200 MP
//After you have successfully picked your heroes, you can start playing the game. You will be receiving different commands, each on a new line, separated by " – ", until the "End" command is given.
//There are several actions that the heroes can perform:
//"CastSpell – {hero name} – {MP needed} – {spell name}"
//•	If the hero has the required MP, he casts the spell, thus reducing his MP. Print this message:
//o	"{hero name} has successfully cast {spell name} and now has {mana points left} MP!"
//•	If the hero is unable to cast the spell print:
//o	"{hero name} does not have enough MP to cast {spell name}!"
//"TakeDamage – {hero name} – {damage} – {attacker}"
//•	Reduce the hero HP by the given damage amount. If the hero is still alive (his HP is greater than 0) print:
//o	"{hero name} was hit for {damage} HP by {attacker} and now has {current HP} HP left!"
//•	If the hero has died, remove him from your party and print:
//o	"{hero name} has been killed by {attacker}!"
//"Recharge – {hero name} – {amount}"
//•	The hero increases his MP. If it brings the MP of the hero above the maximum value (200), MP is increased to 200. (the MP can't go over the maximum value).
//•	 Print the following message:
//o	"{hero name} recharged for {amount recovered} MP!"
//"Heal – {hero name} – {amount}"
//•	The hero increases his HP. If a command is given that would bring the HP of the hero above the maximum value (100), HP is increased to 100 (the HP can't go over the maximum value).
//•	 Print the following message:
//o	"{hero name} healed for {amount recovered} HP!"
//Input
//•	On the first line of the standard input, you will receive an integer n
//•	On the following n lines, the heroes themselves will follow with their hit points and mana points separated by a space in the following format
//•	You will be receiving different commands, each on a new line, separated by " – ", until the "End" command is given
//Output
//•	Print all members of your party who are still alive in the following format (their HP/MP need to be indented 2 spaces):
//"{hero name}
//  HP: {current HP}
//  MP: {current MP}"

public class HeroesOfCodeAndLogicVII03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //1 част: ПОДГОТОВКА ЗА ЗАПОЧВАНЕ ИГРАТА
        int n = Integer.parseInt(scanner.nextLine()); //брой на героите

        //име на героя -> hp
        Map<String, Integer> heroesHP = new LinkedHashMap<>();
        //име на героя -> mp
        Map<String, Integer> heroesMP = new LinkedHashMap<>();

        for (int hero = 1; hero <= n; hero++) {
            //данни за героя -> име, hp, mp
            String heroData = scanner.nextLine(); //"{hero name} {HP} {MP}".split(" ") -> ["{heroName}", "{HP}", "{MP}"]
            String heroName = heroData.split("\\s+")[0];
            int hp = Integer.parseInt(heroData.split("\\s+")[1]);
            int mp = Integer.parseInt(heroData.split("\\s+")[2]);
            //съхраняваме HP -> проверка дали са <= 100
            if (hp <= 100) {
                heroesHP.put(heroName, hp);
            }
            //съхраняваме MP -> проверка дали са <= 200
            if (mp <= 200) {
                heroesMP.put(heroName, mp);
            }
        }
        //heroesHP: всеки герой колко hp има
        //heroesMP: всеки герой колко mp има

        //2 част: започваме да правим магии
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commandParts = command.split("\\s+-\\s+");
            String commandName = commandParts[0]; //"CastSpell", "TakeDamage", "Recharge", "Heal"
            String heroName = commandParts[1]; // име на героя
            switch (commandName) {
                case "CastSpell":
                    //правим магия
                    //command = "CastSpell – {hero name} – {MP needed} – {spell name}"
                    //commandParts = ["CastSpell", "{heroName}", "{MP needed}", "{spell name}"]
                    int mpNeeded = Integer.parseInt(commandParts[2]); // mp нужни за магията
                    String spellName = commandParts[3]; //име на магията
                    int currentMP = heroesMP.get(heroName); //текущи mp

                    //1. можем да направим магията -> currentMP >= mpNeeded
                    if (currentMP >= mpNeeded) {
                        //DO SOME SPELL
                        int mpLeft = currentMP - mpNeeded;// останалите точки след магията
                        heroesMP.put(heroName, mpLeft);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, mpLeft);
                    }
                    //2. не можем да направим магията -> currentMP < mpNeeded
                    else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    //нападение от attacker към hero name - губим HP
                    //command = "TakeDamage – {hero name} – {damage} – {attacker}"
                    //commandParts = ["TakeDamage", "{hero name}", "{damage}", "{attacker}"]
                    int damage = Integer.parseInt(commandParts[2]);
                    String attacker = commandParts[3];
                    //ATAKA
                    int currentHP = heroesHP.get(heroName);
                    currentHP -= damage;

                    //1. ЖИВ след атаката
                    if (currentHP > 0) {
                        heroesHP.put(heroName, currentHP);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, currentHP);
                    }
                    //2. УМРЯЛ след атаката -> currentHP <= 0
                    else {
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                        heroesHP.remove(heroName);
                        heroesMP.remove(heroName);
                    }
                    break;
                case "Recharge":
                    //command = "Recharge – {hero name} – {amount}"
                    //commandParts = ["Recharge", "{hero name}", "{amount}"]
                    int amount = Integer.parseInt(commandParts[2]);
                    int currentMPHero = heroesMP.get(heroName); //текущи MP
                    //увеличаваме MP
                    currentMPHero += amount;

                    //проверка дали не прескачаме максималната стойност за MP
                    if (currentMPHero > 200) {
                        currentMPHero = 200;
                    }

                    System.out.printf("%s recharged for %d MP!%n", heroName, currentMPHero - heroesMP.get(heroName));
                    heroesMP.put(heroName, currentMPHero);
                    break;
                case "Heal":
                    //увеличаваме HP
                    //command = "Heal – {hero name} – {amount}"
                    //commandParts = ["Heal", "{hero name}", "{amount}"]
                    int amountHeal = Integer.parseInt(commandParts[2]); //с колко ще увеличаваме нашите HP
                    int currentHPHero = heroesHP.get(heroName); //текущи HP
                    //увеличаваме HP
                    currentHPHero += amountHeal;

                    //проверка дали не прескачаме максималната стойност за HP
                    if (currentHPHero > 100) {
                        currentHPHero = 100;
                    }
                    System.out.printf("%s healed for %d HP!%n", heroName, currentHPHero - heroesHP.get(heroName));
                    heroesHP.put(heroName, currentHPHero);
                    break;
            }
            command = scanner.nextLine();
        }
        heroesHP.entrySet().forEach(entry -> {
            //entry: key(hero name) -> value (hp)
            System.out.println(entry.getKey());
            System.out.println("  HP: " + entry.getValue());
            System.out.println("  MP: " + heroesMP.get(entry.getKey()));
        });
    }
}
