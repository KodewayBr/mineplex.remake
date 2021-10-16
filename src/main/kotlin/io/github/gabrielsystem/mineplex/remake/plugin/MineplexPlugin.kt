package io.github.gabrielsystem.mineplex.remake.plugin

import org.bukkit.plugin.java.JavaPlugin

/**
 * @author SrGabrieel
 **/
open class MineplexPlugin : JavaPlugin() {

    override fun onEnable() {
        enable()
    }

    override fun onDisable() {
        disable()
    }

    open fun enable() {}

    open fun disable() {}

}