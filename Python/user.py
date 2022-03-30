from account import Account


class User(Account):
    def __init__(self, name: str, document: str) -> None:
        super().__init__(name, document)
