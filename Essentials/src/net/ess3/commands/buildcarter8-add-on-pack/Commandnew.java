package net.ess3.commands;
//imports added later


public class Commandnew extends EssentialsCommand
{
  @Override
public void run(final IUser user, final String commandLabel, final String[] args) throws Exception
{
   buildcarter8aop.broadcastMessage(ChatColor.RED + sender.getName() + " is a noob");
