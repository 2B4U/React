package primal.bukkit.command;

import primal.lang.collection.GList;

/**
 * Represents a pawn command
 *
 * @author cyberpwn
 *
 */
public interface ICommand
{
	GList<String> getRequiredPermissions();

	/**
	 * Get the name of this command (node)
	 *
	 * @return the node
	 */
    String getNode();

	/**
	 * Get all (realized) nodes of this command
	 *
	 * @return the nodes
	 */
    GList<String> getNodes();

	/**
	 * Get all (every) node in this command
	 *
	 * @return all nodes
	 */
    GList<String> getAllNodes();

	/**
	 * Add a node to this command
	 *
	 * @param node
	 *            the node
	 */
    void addNode(String node);

	/**
	 * Handle a command. If this is a subcommand, parameters after the subcommand
	 * will be adapted in args for you
	 *
	 * @param sender
	 *            the volume sender (pre-tagged)
	 * @param args
	 *            the arguments after this command node
	 * @return return true to mark it as handled
	 */
    boolean handle(PrimalSender sender, String[] args);
}
