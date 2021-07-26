package d2.socket;

public class Chipped {

  public AmethystGem getAmethystGem() {
    return new AmethystGem();
  }

    public class AmethystGem implements Amethyst {

      @Override
      public int attackRatingAmount() {
        return 40;
      }

      @Override
      public int strangeAmount() {
        return 3;
      }

      @Override
      public int defenceAmount() {
        return 8;
      }

      @Override
      public boolean socketable() {
        return true;
      }

      @Override
      public String socketableArmor() {
        return "I socket Chipped Amethyst in Armor";
      }

      @Override
      public String socketableWeapon() {
        return "I socket Chipped Amethyst in Weapon";
      }

      @Override
      public String socketableHelm() {
        return "I socket Chipped Amethyst in Helm";
      }

      @Override
      public String socketableShield() {
        return "I socket Chipped Amethyst in Shield";
      }

      @Override
      public String gemType() {
        return "Chipped Amethyst";
      }
    }

    class Sapphiregem implements Sapphire {

      @Override
      public boolean socketable() {
        return true;
      }

      @Override
      public String socketableArmor() {
        return "I socket Chipped Sapphire in Armor";
      }

      @Override
      public String socketableWeapon() {
        return "I socket Chipped Sapphire in Weapon";
      }

      @Override
      public String socketableHelm() {
        return "I socket Chipped Sapphire in Helm";
      }

      @Override
      public String socketableShield() {
        return "I socket Chipped Sapphire in Shield";
      }

      @Override
      public String gemType() {
        return "Chipped Sapphire";
      }

      @Override
      public int manaAddAmount() {
        return 10;
      }

      @Override
      public int coldDamageAddAmount() {
        return 10;
      }

      @Override
      public int coldResistAddAmount() {
        return 4;
      }
    }

    class DiamondGem implements Diamont{

      @Override
      public int attackRatingAmount() {
        return 20;
      }

      @Override
      public int damageAmount() {
        return 8;
      }

      @Override
      public int allResistAmount() {
        return 4;
      }

      @Override
      public boolean socketable() {
        return true;
      }

      @Override
      public String socketableArmor() {
        return "I socket Chipped Diamond in Armor";
      }

      @Override
      public String socketableWeapon() {
        return "I socket Chipped Diamond in Weapon";
      }

      @Override
      public String socketableHelm() {
        return "I socket Chipped Diamond in Helm";
      }

      @Override
      public String socketableShield() {
        return "I socket Chipped Diamond in Shield";
      }

      @Override
      public String gemType() {
        return "Chipped Diamond";
      }
    }

    class Emeraldgen implements Emerald{

      @Override
      public int dexAddAmount() {
        return 3;
      }

      @Override
      public int poisonDamageAmount() {
        return 6;
      }

      @Override
      public int poisonResistAmount() {
        return 8;
      }

      @Override
      public boolean socketable() {
        return true;
      }

      @Override
      public String socketableArmor() {
        return "I socket Chipped Emerald in Armor";
      }

      @Override
      public String socketableWeapon() {
        return "I socket Chipped Emerald in Weapon";
      }

      @Override
      public String socketableHelm() {
        return "I socket Chipped Emerald in Helm";
      }

      @Override
      public String socketableShield() {
        return "I socket Chipped Emerald in Shield";
      }

      @Override
      public String gemType() {
        return "Chipped Emerald";
      }
    }

    class Topazgem implements Topaz {

      @Override
      public boolean socketable() {
        return true;
      }

      @Override
      public String socketableArmor() {
        return "I socket Chipped Topaz in Armor";
      }

      @Override
      public String socketableWeapon() {
        return "I socket Chipped Topaz in Weapon";
      }

      @Override
      public String socketableHelm() {
        return "I socket Chipped Topaz in Helm";
      }

      @Override
      public String socketableShield() {
        return "I socket Chipped Topaz in Shield";
      }

      @Override
      public String gemType() {
        return "Chipped Topaz";
      }

      @Override
      public int mfAmount() {
        return 8;
      }

      @Override
      public int lightingDamageAmount() {
        return 13;
      }

      @Override
      public int lightingResistAmount() {
        return 8;
      }
    }
    
    class Rubygem implements Ruby {

      @Override
      public boolean socketable() {
        return true;
      }

      @Override
      public String socketableArmor() {
        return "I socket Chipped Ruby in Armor";
      }

      @Override
      public String socketableWeapon() {
        return "I socket Chipped Ruby in Weapon";
      }

      @Override
      public String socketableHelm() {
        return "I socket Chipped Ruby in Helm";
      }

      @Override
      public String socketableShield() {
        return "I socket Chipped Ruby in Shield";
      }

      @Override
      public String gemType() {
        return "Chipped Ruby";
      }

      @Override
      public int hpAddAmount() {
        return 12;
      }

      @Override
      public int fireDamageAmount() {
        return 10;
      }

      @Override
      public int fireResistAmount() {
        return 8;
      }
    }

    class Skullgem implements Skull {

      @Override
      public boolean socketable() {
        return true;
      }

      @Override
      public String socketableArmor() {
        return "I socket Chipped Skull in Armor";
      }

      @Override
      public String socketableWeapon() {
        return "I socket Chipped Skull in Weapon";
      }

      @Override
      public String socketableHelm() {
        return "I socket Chipped Skull in Helm";
      }

      @Override
      public String socketableShield() {
        return "I socket Chipped Skull in Shield";
      }

      @Override
      public String gemType() {
        return "Chipped Skull";
      }

      @Override
      public int regenAmount() {
        return 2;
      }

      @Override
      public int stealAmount() {
        return 1;
      }

      @Override
      public int attakersTakeDamageAmount() {
        return 50;
      }
    }
}
