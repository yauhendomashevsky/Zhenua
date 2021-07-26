package d2.socket;

public class Flawed {

  class AmethystGem implements Amethyst {

    @Override
    public int attackRatingAmount() {
      return 50;
    }

    @Override
    public int strangeAmount() {
      return 8;
    }

    @Override
    public int defenceAmount() {
      return 12;
    }

    @Override
    public boolean socketable() {
      return true;
    }

    @Override
    public String socketableArmor() {
      return "I socket Flawed ametist in Armor";
    }

    @Override
    public String socketableWeapon() {
      return "I socket Flawed ametist in Weapon";
    }

    @Override
    public String socketableHelm() {
      return "I socket Flawed ametist in Helm";
    }

    @Override
    public String socketableShield() {
      return "I socket Flawed ametist in Shield";
    }

    @Override
    public String gemType() {
      return "Flawed Ametist";
    }
  }

  class Sapphiregem implements Sapphire {

    @Override
    public boolean socketable() {
      return true;
    }

    @Override
    public String socketableArmor() {
      return "I socket Flawed sapphire in Armor";
    }

    @Override
    public String socketableWeapon() {
      return "I socket Flawed sapphire in Weapon";
    }

    @Override
    public String socketableHelm() {
      return "I socket Flawed sapphire in Helm";
    }

    @Override
    public String socketableShield() {
      return "I socket Flawed sapphire in Shield";
    }

    @Override
    public String gemType() {
      return "Flawed sapphire";
    }

    @Override
    public int manaAddAmount() {
      return 15;
    }

    @Override
    public int coldDamageAddAmount() {
      return 20;
    }

    @Override
    public int coldResistAddAmount() {
      return 10;
    }
  }

  class DiamondGem implements Diamont{

    @Override
    public int attackRatingAmount() {
      return 30;
    }

    @Override
    public int damageAmount() {
      return 12;
    }

    @Override
    public int allResistAmount() {
      return 8;
    }

    @Override
    public boolean socketable() {
      return true;
    }

    @Override
    public String socketableArmor() {
      return "I socket Flawed diamond in Armor";
    }

    @Override
    public String socketableWeapon() {
      return "I socket Flawed diamond in Weapon";
    }

    @Override
    public String socketableHelm() {
      return "I socket Flawed diamond in Helm";
    }

    @Override
    public String socketableShield() {
      return "I socket Flawed diamond in Shield";
    }

    @Override
    public String gemType() {
      return "Flawed diamond";
    }
  }

  class Emeraldgen implements Emerald{

    @Override
    public int dexAddAmount() {
      return 4;
    }

    @Override
    public int poisonDamageAmount() {
      return 8;
    }

    @Override
    public int poisonResistAmount() {
      return 10;
    }

    @Override
    public boolean socketable() {
      return true;
    }

    @Override
    public String socketableArmor() {
      return "I socket Flawed emerald in Armor";
    }

    @Override
    public String socketableWeapon() {
      return "I socket Flawed emerald in Weapon";
    }

    @Override
    public String socketableHelm() {
      return "I socket Flawed emerald in Helm";
    }

    @Override
    public String socketableShield() {
      return "I socket Flawed emerald in Shield";
    }

    @Override
    public String gemType() {
      return "Flawed emerald";
    }
  }

  class Topazgem implements Topaz {

    @Override
    public boolean socketable() {
      return true;
    }

    @Override
    public String socketableArmor() {
      return "I socket Flawed topaz in Armor";
    }

    @Override
    public String socketableWeapon() {
      return "I socket Flawed topaz in Weapon";
    }

    @Override
    public String socketableHelm() {
      return "I socket Flawed topaz in Helm";
    }

    @Override
    public String socketableShield() {
      return "I socket Flawed topaz in Shield";
    }

    @Override
    public String gemType() {
      return "Flawed topaz";
    }

    @Override
    public int mfAmount() {
      return 14;
    }

    @Override
    public int lightingDamageAmount() {
      return 17;
    }

    @Override
    public int lightingResistAmount() {
      return 10;
    }
  }

  class Rubygem implements Ruby {

    @Override
    public boolean socketable() {
      return true;
    }

    @Override
    public String socketableArmor() {
      return "I socket Flawed ruby in Armor";
    }

    @Override
    public String socketableWeapon() {
      return "I socket Flawed ruby in Weapon";
    }

    @Override
    public String socketableHelm() {
      return "I socket Flawed ruby in Helm";
    }

    @Override
    public String socketableShield() {
      return "I socket Flawed ruby in Shield";
    }

    @Override
    public String gemType() {
      return "Flawed ruby";
    }

    @Override
    public int hpAddAmount() {
      return 16;
    }

    @Override
    public int fireDamageAmount() {
      return 15;
    }

    @Override
    public int fireResistAmount() {
      return 10;
    }
  }

  class Skullgem implements Skull {

    @Override
    public boolean socketable() {
      return true;
    }

    @Override
    public String socketableArmor() {
      return "I socket Flawed skull in Armor";
    }

    @Override
    public String socketableWeapon() {
      return "I socket Flawed skull in Weapon";
    }

    @Override
    public String socketableHelm() {
      return "I socket Flawed skull in Helm";
    }

    @Override
    public String socketableShield() {
      return "I socket Flawed skull in Shield";
    }

    @Override
    public String gemType() {
      return "Flawed skull";
    }

    @Override
    public int regenAmount() {
      return 3;
    }

    @Override
    public int stealAmount() {
      return 2;
    }

    @Override
    public int attakersTakeDamageAmount() {
      return 100;
    }
  }
}
