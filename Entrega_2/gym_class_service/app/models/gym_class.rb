class GymClass < ApplicationRecord
  has_many :events

  # Validations
  validates :name, presence: true, length: { minimun: 3, maximum: 100 }
end
