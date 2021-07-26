package d2.socket;

public class RegularGem {

  class AmethystGem implements Amethyst {

    @Override
    public int attackRatingAmount() {
      return 60;
    }

    @Override
    public int strangeAmount() {
      return 12;
    }

    @Override
    public int defenceAmount() {
      return 16;
    }

    @Override
    public boolean socketable() {
      return true;
    }

    @Override
    public String socketableArmor() {
      return "I socket Amethyst in Armor";
    }

    @Override
    public String socketableWeapon() {
      return "I socket Amethyst in Weapon";
    }

    @Override
    public String socketableHelm() {
      return "I socket Amethyst in Helm";
    }

    @Override
    public String socketableShield() {
      return "I socket Amethyst in Shield";
    }

    @Override
    public String gemType() {
      return " Amethyst";
    }
  }

  class SapphireGem implements Sapphire{

    @Override
    public boolean socketable() {
      return true;
    }

    @Override
    public String socketableArmor() {
      return "I socket Sapphire in Armor";
    }

    @Override
    public String socketableWeapon() {
      return "I socket Sapphire in Weapon";
    }

    @Override
    public String socketableHelm() {
      return "I socket Sapphire in Helm";
    }

    @Override
    public String socketableShield() {
      return "I socket Sapphire in Shield";
    }

    @Override
    public String gemType() {
      return "Sapphire";
    }

    @Override
    public int manaAddAmount() {
      return 20;
    }

    @Override
    public int coldDamageAddAmount() {
      return 25;
    }

    @Override
    public int coldResistAddAmount() {
      return 15;
    }
  }

  class DiamondGem implements Diamont {

    @Override
    public int attackRatingAmount() {
      return 40;
    }

    @Override
    public int damageAmount() {
      return 16;
    }

    @Override
    public int allResistAmount() {
      return 12;
    }

    @Override
    public boolean socketable() {
      return true;
    }

    @Override
    public String socketableArmor() {
      return "I socket Diamond in Armor";
    }

    @Override
    public String socketableWeapon() {
      return "I socket Diamond in Weapon";
    }

    @Override
    public String socketableHelm() {
      return "I socket Diamond in Helm";
    }

    @Override
    public String socketableShield() {
      return "I socket Diamond in Shield";
    }

    @Override
    public String gemType() {
      return "Diamond";
    }
  }

  class EmeraldGen implements Emerald {

    @Override
    public int dexAddAmount() {
      return 8;
    }

    @Override
    public int poisonDamageAmount() {
      return 25;
    }

    @Override
    public int poisonResistAmount() {
      return 15;
    }

    @Override
    public boolean socketable() {
      return true;
    }

    @Override
    public String socketableArmor() {
      return "I socket Emerald in Armor";
    }

    @Override
    public String socketableWeapon() {
      return "I socket Emerald in Weapon";
    }

    @Override
    public String socketableHelm() {
      return "I socket Emerald in Helm";
    }

    @Override
    public String socketableShield() {
      return "I socket Emerald in Shield";
    }

    @Override
    public String gemType() {
      return "Emerald";
    }
  }

  class TopazGem implements Topaz {

    @Override
    public boolean socketable() {
      return true;
    }

    @Override
    public String socketableArmor() {
      return "I socket Topaz in Armor";
    }

    @Override
    public String socketableWeapon() {
      return "I socket Topaz in Weapon";
    }

    @Override
    public String socketableHelm() {
      return "I socket Topaz in Helm";
    }

    @Override
    public String socketableShield() {
      return "I socket Topaz in Shield";
    }

    @Override
    public String gemType() {
      return "Topaz";
    }

    @Override
    public int mfAmount() {
      return 18;
    }

    @Override
    public int lightingDamageAmount() {
      return 25;
    }

    @Override
    public int lightingResistAmount() {
      return 15;
    }
  }

  class RubyGem implements Ruby{

    @Override
    public boolean socketable() {
      return true;
    }

    @Override
    public String socketableArmor() {
      return "I socket Ruby in Armor";
    }

    @Override
    public String socketableWeapon() {
      return "I socket Ruby in Weapon";
    }

    @Override
    public String socketableHelm() {
      return "I socket Ruby in Helm";
    }

    @Override
    public String socketableShield() {
      return "I socket Ruby in Shield";
    }

    @Override
    public String gemType() {
      return "Ruby";
    }

    @Override
    public int hpAddAmount() {
      return 25;
    }

    @Override
    public int fireDamageAmount() {
      return 20;
    }

    @Override
    public int fireResistAmount() {
      return 15;
    }
  }

  class SkullGem implements Skull {

    @Override
    public boolean socketable() {
      return true;
    }

    @Override
    public String socketableArmor() {
      return "I socket Skull in Armor";
    }

    @Override
    public String socketableWeapon() {
      return "I socket Skull in Weapon";
    }

    @Override
    public String socketableHelm() {
      return "I socket Skull in Helm";
    }

    @Override
    public String socketableShield() {
      return "I socket Skull in Shield";
    }

    @Override
    public String gemType() {
      return "Skull";
    }

    @Override
    public int regenAmount() {
      return 4;
    }

    @Override
    public int stealAmount() {
      return 3;
    }

    @Override
    public int attakersTakeDamageAmount() {
      return 150;
    }
  }
}
