package kaka.me.macsmp

import kaka.me.macsmp.commands.RegenSwordCommand
import kaka.me.macsmp.commands.StrengthSwordCommand
import kaka.me.macsmp.commands.TankSwordCommand
import kaka.me.macsmp.commands.WeaknessSwordCommand
import kaka.me.macsmp.listeners.passiveRegenEffect
import kaka.me.macsmp.listeners.passiveStrengthEffect
import kaka.me.macsmp.listeners.passiveTankEffect
import kaka.me.macsmp.listeners.passiveWeaknessEffect
import org.bukkit.plugin.java.JavaPlugin

class Macsmp : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        logger.info("Radi jebeni plugin :D")

        //Ability stuff
        logger.info("Rade abilitiji :D")
        passiveStrengthEffect(this).runTaskTimer(this, 0L, 20L)
        passiveTankEffect(this).runTaskTimer(this, 0L, 20L)
        passiveWeaknessEffect(this).runTaskTimer(this, 0L, 20L)
        passiveRegenEffect(this).runTaskTimer(this, 0L, 20L)

        registerCommands()

    }

    private fun registerCommands() {
        getCommand("strength-sword")?.setExecutor(StrengthSwordCommand())
        getCommand("tank-sword")?.setExecutor(TankSwordCommand())
        getCommand("weakness-sword")?.setExecutor(WeaknessSwordCommand())
        getCommand("regen-sword")?.setExecutor(RegenSwordCommand())

        logger.info("Registrovana komanda (tuf)")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("Zaustavljen jebeni plugin :(")
    }
}
