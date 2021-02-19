package employeetracker.storage;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

import employeetracker.commons.exceptions.DataConversionException;
import employeetracker.model.ReadOnlyEmployeeTracker;
import employeetracker.model.ReadOnlyUserPrefs;
import employeetracker.model.UserPrefs;

/**
 * API of the Storage component
 */
public interface Storage extends AddressBookStorage, UserPrefsStorage {

    @Override
    Optional<UserPrefs> readUserPrefs() throws DataConversionException, IOException;

    @Override
    void saveUserPrefs(ReadOnlyUserPrefs userPrefs) throws IOException;

    @Override
    Path getAddressBookFilePath();

    @Override
    Optional<ReadOnlyEmployeeTracker> readAddressBook() throws DataConversionException, IOException;

    @Override
    void saveAddressBook(ReadOnlyEmployeeTracker addressBook) throws IOException;

}
