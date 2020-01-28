package com.githhub.startzyp;

import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import net.milkbowl.vault.permission.Permission;

public class qxkz extends JavaPlugin {
    public static Permission perms = null;

    @Override
    public void onEnable() {
        setupPermissions();

        super.onEnable();
    }

    private void setupPermissions() {
        RegisteredServiceProvider< Permission > rsp = getServer().getServicesManager().getRegistration(Permission.class);
        perms = rsp.getProvider();
    }
}
