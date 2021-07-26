package d2.socket;

public class Perfect {

  class AmethystGem implements Amethyst {

    @Override
    public int attackRatingAmount() {
      return 200;
    }

    @Override
    public int strangeAmount() {
      return 32;
    }

    @Override
    public int defenceAmount() {
      return 48;
    }

    @Override
    public boolean socketable() {
      return true;
    }

    @Override
    public String socketableArmor() {
      return "I socket Perfect Amethyst in Armor";
    }

    @Override
    public String socketableWeapon() {
      return "I socket Perfect Amethyst in Weapon";
    }

    @Override
    public String socketableHelm() {
      return "I socket Perfect Amethyst in Helm";
    }

    @Override
    public String socketableShield() {
      return "I socket Perfect Amethyst in Shield";
    }

    @Override
    public String gemType() {
      return "Perfect Amethyst";
    }
  }

  class SapphireGem implements Sapphire {

    @Override
    public boolean socketable() {
      return true;
    }

    @Override
    public String socketableArmor() {
      return "I socket Perfect Sapphire in Armor";
    }

    @Override
    public String socketableWeapon() {
      return "I socket  Sapphire in Weapon";
    }

    @Override
    public String socketableHelm() {
      return "I socket Perfect Sapphire in Helm";
    }

    @Override
    public String socketableShield() {
      return "I socket Perfect Sapphire in Shield";
    }

    @Override
    public String gemType() {
      return "Perfect Sapphire";
    }

    @Override
    public int manaAddAmount() {
      return 50;
    }

    @Override
    public int coldDamageAddAmount() {
      return 50;
    }

    @Override
    public int coldResistAddAmount() {
      return 40;
    }
  }

  class DiamondGem implements Diamont{

    @Override
    public int attackRatingAmount() {
      return 140;
    }

    @Override
    public int damageAmount() {
      return 48;
    }

    @Override
    public int allResistAmount() {
      return 32;
    }

    @Override
    public boolean socketable() {
      return true;
    }

    @Override
    public String socketableArmor() {
      return "I socket Perfect Diamond in Armor";
    }

    @Override
    public String socketableWeapon() {
      return "I socket Perfect Diamond in Weapon";
    }

    @Override
    public String socketableHelm() {
      return "I socket Perfect Diamond in Helm";
    }

    @Override
    public String socketableShield() {
      return "I socket Perfect Diamond in Shield";
    }

    @Override
    public String gemType() {
      return "Perfect Diamond";
    }
  }

  class EmeraldGen implements Emerald{

    @Override
    public int dexAddAmount() {
      return 16;
    }

    @Override
    public int poisonDamageAmount() {
      return 32;
    }

    @Override
    public int poisonResistAmount() {
      return 40;
    }

    @Override
    public boolean socketable() {
      return true;
    }

    @Override
    public String socketableArmor() {
      return "I socket Perfect Emerald in Armor";
    }

    @Override
    public String socketableWeapon() {
      return "I socket Perfect Emerald in Weapon";
    }

    @Override
    public String socketableHelm() {
      return "I socket Perfect Emerald in Helm";
    }

    @Override
    public String socketableShield() {
      return "I socket Perfect Emerald in Shield";
    }

    @Override
    public String gemType() {
      return "Perfect Emerald";
    }
  }

  class TopazGem implements Topaz {

    @Override
    public boolean socketable() {
      return true;
    }

    @Override
    public String socketableArmor() {
      return "I socket Perfect Topaz in Armor";
    }

    @Override
    public String socketableWeapon() {
      return "I socket Perfect Topaz in Weapon";
    }

    @Override
    public String socketableHelm() {
      return "I socket Perfect Topaz in Helm";
    }

    @Override
    public String socketableShield() {
      return "I socket Perfect Topaz in Shield";
    }

    @Override
    public String gemType() {
      return "Perfect Topaz";
    }

    @Override
    public int mfAmount() {
      return 48;
    }

    @Override
    public int lightingDamageAmount() {
      return 55;
    }

    @Override
    public int lightingResistAmount() {
      return 40;
    }
  }

  class Rubygem implements Ruby {

    @Override
    public boolean socketable() {
      return true;
    }

    @Override
    public String socketableArmor() {
      return "I socket Perfect Ruby in Armor";
    }

    @Override
    public String socketableWeapon() {
      return "I socket Perfect Ruby in Weapon";
    }

    @Override
    public String socketableHelm() {
      return "I socket Perfect Ruby in Helm";
    }

    @Override
    public String socketableShield() {
      return "I socket Perfect Ruby in Shield";
    }

    @Override
    public String gemType() {
      return "Perfect Ruby";
    }

    @Override
    public int hpAddAmount() {
      return 50;
    }

    @Override
    public int fireDamageAmount() {
      return 50;
    }

    @Override
    public int fireResistAmount() {
      return 40;
    }
  }

  class SkullGem implements Skull {

    @Override
    public boolean socketable() {
      return true;
    }

    @Override
    public String socketableArmor() {
      return "I socket Perfect Skull in Armor";
    }

    @Override
    public String socketableWeapon() {
      return "I socket Perfect Skull in Weapon";
    }

    @Override
    public String socketableHelm() {
      return "I socket Perfect Skull in Helm";
    }

    @Override
    public String socketableShield() {
      return "I socket Perfect Skull in Shield";
    }

    @Override
    public String gemType() {
      return "Perfect Skull";
    }

    @Override
    public int regenAmount() {
      return 6;
    }

    @Override
    public int stealAmount() {
      return 5;
    }

    @Override
    public int attakersTakeDamageAmount() {
      return 400;
    }
  }

}
