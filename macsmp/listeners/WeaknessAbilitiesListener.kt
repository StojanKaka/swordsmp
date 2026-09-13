package kaka.me.macsmp.listeners

import org.bukkit.Bukkit
import org.bukkit.scheduler.BukkitRunnable
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType
import org.bukkit.plugin.java.JavaPlugin


class passiveWeaknessEffect(private val plugin: JavaPlugin) : BukkitRunnable() {
    override fun run() {

        Bukkit.getOnlinePlayers().forEach { player ->
            val itemInHand = player.inventory.itemInMainHand

            if (itemInHand.type.isAir) return@forEach

            val meta = itemInHand.itemMeta ?: return@forEach

            if (meta.hasDisplayName()) {
                val displayNameStr = "${meta.displayName}"
            }

            if (meta.hasDisplayName() && "${meta.displayName}".contains("Weakness Sword")) {
                val weaknessEffect = PotionEffect(PotionEffectType.WEAKNESS, 50, 0)
                player.addPotionEffect(weaknessEffect)
            }

            if (meta.hasDisplayName() && "${meta.displayName}".contains("Weakness Sword")) {
                val weaknessEffect2 = PotionEffect(PotionEffectType.SPEED, 50, 1)
                player.addPotionEffect(weaknessEffect2)
            }
        }
    }
}
