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

class TankSwordCommand : CommandExecutor {
    override fun onCommand(
        sender: CommandSender,
        command: Command,
        label: String,
        args: Array<out String>
    ): Boolean {

        if(sender !is Player) return false
        if(!sender.isOp) return false

        val tankSwordItem: ItemStack = ItemStack(Material.NETHERITE_SWORD)
        val itemMeta = tankSwordItem.itemMeta

        itemMeta.displayName(Component.text("Tank Sword").color(TextColor.color(255, 255, 0)).decorate(TextDecoration.BOLD))
        itemMeta.setCustomModelData(267420)

        tankSwordItem.itemMeta = itemMeta

        sender.inventory.addItem(tankSwordItem)

        return false
    }

}