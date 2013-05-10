package mods.ak4w;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTwardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityGlobulox extends EntityMob{

public EntityGlobulox(World par1World)
{
super(par1World);
this.texture = "/mob/test.png";
this.moveSpeed = 0.2F;
this.livingSoundTime = 1200;
this.tasks.addTask(0, new EntityAISwimming(this));
this.tasks.addTask(1, new EntityAIPanic(this, 0.5F));
this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 0.4F, true));
this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityPig.class, 0.4F, true));
this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityCow.class, 0.4F, true));
this.tasks.addTask(5, new EntityAIAttackOnCollide(this, EntityChicken.class, 0.4F, true));
this.tasks.addTask(6, new EntityAIAttackOnCollide(this, EntitySheep.class, 0.4F, true));
this.tasks.addTask(7, new EntityAIMoveTwardsRestriction(this, this.moveSpeed));
this.tasks.addTask(8, new EntityAIWander(this, this.moveSpeed));
this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
this.tasks.addTask(9, new EntityAILookIdle(this));
this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 16.0F, 0, true));
this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityPig.class, 16.0F, 0, true));
this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityCow.class, 16.0F, 0, true));
this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityChicken.class, 16.0F, 0, true));
this.targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntitySheep.class, 16.0F, 0, true));
}

public int getMaxHealth()
{
return 20;
}

protected boolean isAIEnabled()
{
return true;
}

public float getSpeedModifier()
{
return super.getSpeedModifier();
}

public void onLivingUpdate()
{
super.onLivingUpdate();
}

public int getAttackStrength(Entity par1Entity)
{
return 3;
}
}