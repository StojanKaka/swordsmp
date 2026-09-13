package kaka.me.macsmp.commands

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.TextColor
import net.kyori.adventure.text.format.TextColor.color
import net.kyori.adventure.text.format.TextDecoration
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class RegenSwordCommand : CommandExecutor {
    override fun onCommand(
        sender: CommandSender,
        command: Command,
        label: String,
        args: Array<out String>
    ): Boolean {

        if(sender !is Player) return false
        if(!sender.isOp) return false

        val regenSwordItem: ItemStack = ItemStack(Material.NETHERITE_SWORD)
        val itemMeta = regenSwordItem.itemMeta

        itemMeta.displayName(Component.text("Regen Sword").color(TextColor.color(0, 255, 0)).decorate(TextDecoration.BOLD))
        itemMeta.setCustomModelData(467420)

        regenSwordItem.itemMeta = itemMeta

        sender.inventory.addItem(regenSwordItem)

        return false
    }

}