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

class StrengthSwordCommand : CommandExecutor {
    override fun onCommand(
        sender: CommandSender,
        command: Command,
        label: String,
        args: Array<out String>
    ): Boolean {

        if(sender !is Player) return false
        if(!sender.isOp) return false

        val strengthSwordItem: ItemStack = ItemStack(Material.NETHERITE_SWORD)
        val itemMeta = strengthSwordItem.itemMeta

        itemMeta.displayName(Component.text("Strength Sword").color(TextColor.color(255, 0, 0)).decorate(TextDecoration.BOLD))
        itemMeta.setCustomModelData(167420)

        strengthSwordItem.itemMeta = itemMeta

        sender.inventory.addItem(strengthSwordItem)

        return false
    }

}