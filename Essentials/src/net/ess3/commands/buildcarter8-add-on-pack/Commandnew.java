package net.ess3.commands;
//imports added later


public class Commandnew extends EssentialsCommand
{
  @Override
public void run(final IUser user, final String commandLabel, final String[] args) throws Exception
{
   buildcarter8aop.broadcastMessage(ChatColor.RED + sender.getName() + " is a noob");
//Ok build, let me get this started here, you do not put the command in a new folder, the plugin won't detect that this is a command. Put it in the commands folder, second of all, this coding sucks. Third: What do you plan to do?
