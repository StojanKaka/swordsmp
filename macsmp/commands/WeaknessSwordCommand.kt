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

class WeaknessSwordCommand : CommandExecutor {
    override fun onCommand(
        sender: CommandSender,
        command: Command,
        label: String,
        args: Array<out String>
    ): Boolean {

        if(sender !is Player) return false
        if(!sender.isOp) return false

        val weaknessSwordItem: ItemStack = ItemStack(Material.NETHERITE_SWORD)
        val itemMeta = weaknessSwordItem.itemMeta

        itemMeta.displayName(Component.text("Weakness Sword").color(TextColor.color(0, 0, 255)).decorate(TextDecoration.BOLD))
        itemMeta.setCustomModelData(367420)

        weaknessSwordItem.itemMeta = itemMeta

        sender.inventory.addItem(weaknessSwordItem)

        return false
    }

}