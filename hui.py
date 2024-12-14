class Room(ABC):
    @classmethod
    @abstractmethod
    def from_stdin(cls, stdin):
        return cls(...)

class IFromStdin:
        def from_stdin(cls, stdin): ...


class Bedroom(IFromStdin):
    @classmethod
    def from_stdin(cls, stdin):
        return cls()

class Main:
    def main():
        room_cls = get_room_type(stdin)
        room_cls.from_stdin(stdin)

    def get_room_type(stdin) -> type[IFromStdin]:
        pass