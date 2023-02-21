package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.model.Model;

/**
 * Sorts persons in the address book.
 */
public class SortCommand extends Command {
    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_SUCCESS = "Sorted address book!";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Sorts all persons by name in a given order "
            + "Either ascending or descending order.\n"
            + "Parameters: Ascending/Asc or Descending/Desc (case-insensitive).\n"
            + "Example: " + COMMAND_WORD + " Ascending/Descending";

    private final String order;

    public SortCommand(String order) {
        this.order = order;
    }


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.sortPersonList(this.order);
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
